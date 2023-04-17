package kr.eddi.demo.lectureClass.vue.controller;

import kr.eddi.demo.lectureClass.utility.random.CustomRandom;
import kr.eddi.demo.lectureClass.vue.controller.form.VueRequestTestDataForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/vue-test")
public class VueTestController {

    /*
    실제 @RequestMapping("/vue-test")와 @PostMapping("/receive-test")로 URL 경로가 만들어진다.
    아래쪽에 있는 @RequestBody를 살펴봐야 한다.
    객체화된 정보 집합을 받을 때 아래와 같이 @RequestBody를 사용한다.
    또한 주의할 부분이 있는데 VueRequestTestDataForm은 vue가 전송한 양식을 동일하게 유지하고 있어야 한다.
    전송한 이름에 해당하는 studentName, studentAge 같은 정보가 정확하게 일치해야 한다.
    */
    @PostMapping("/receive-test")
    public void receiveTest (@RequestBody VueRequestTestDataForm vueRequestTestDataForm) {
        log.info("received data: " + vueRequestTestDataForm);
    }

    @GetMapping("/get-random-dice")
    public Integer getRandomDice () {
        final int MIN = 1;
        final int MAX = 6;

        log.info("getRandomDice() 요청!");

        return CustomRandom.generateNumber(MIN, MAX);
    }

//      여기에 주사위 값을 받아와서
//      주사위1 + 주사위2 의 결과 짝/홀수 판명하는 것이 필요함.

//    @GetMapping("/get-dice-add-result")
//    public String getDiceResult (int 주사위1, int 주사위2) {
//
//    int addNumber = 0;
//    addNumber = 주사위1 + 주사위2
//
//    if(addNumber % 2 == 0){
//         return "짝수";
//    }
//
//        return "홀수";
//    }

}
