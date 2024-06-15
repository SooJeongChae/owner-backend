package semohan.owner.domain.menu.domain;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import semohan.owner.domain.restaurant.domain.Restaurant;

import java.util.Date;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Temporal(TemporalType.DATE)    // 시간 정보 없이 날짜만 저장
    private Date mealDate;

    @NotNull
    private String mainMenu; // '|'로 구분된 문자열

    @NotNull
    private String subMenu; // '|'로 구분된 문자열

    @NotNull
    private int mealType;

    @NotNull
    private int likesMenu = 0;  // 좋아요 수

    @NotNull
    @ManyToOne
    private Restaurant restaurant;
}