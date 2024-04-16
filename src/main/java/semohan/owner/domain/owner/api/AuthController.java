package semohan.owner.domain.owner.api;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import semohan.owner.domain.owner.application.AuthService;
import semohan.owner.domain.owner.dto.SignInDto;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthService authService;

//    @PostMapping(value = "/sign-in")
//    public ResponseEntity<Boolean> signIn(@RequestBody SignInDto signInDto, HttpServletRequest httpServletRequest) {
//        return ResponseEntity.ok(authService.signIn(signInDto, httpServletRequest));
//    }

    @PostMapping(value = "/sign-in")
    public ResponseEntity<Boolean> signIn(@RequestParam String username, @RequestParam String password, HttpServletRequest httpServletRequest) {
        return ResponseEntity.ok(authService.signIn(new SignInDto(username, password), httpServletRequest));
    }

}
