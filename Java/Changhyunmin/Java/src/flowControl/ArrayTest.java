package flowControl;

public class ArrayTest {
    public static void main(String[] args) {
        final int START = 0;

        //배열을 만드는 방법 (일단 final은 제끼세요)1.데이터 타임을 적고 대괄호[]를 적습니다.
        //2.변수 선언하듯 변수 이름을 적성합니다. 당연히 이름이기 때문에 전달력 및 표현력이 중요합니다.
        //3.필요하다면 중괄호를 열고 초기화를 하거나 또는 new 데이터 타입(1번)
        //[]형태로 Heap에 메모리 할당을 강제할수 있습니다.
        int[] numberArray = {1,2,3,4,5};

        for (int i = START; i<numberArray.length; i++) {
        //여기서 이야기 한 Heap과 대조되는 것이 Stack입니다.
            //현제 위 코드는Stack이라는 지역변수에 설정하는 배열이며
            //new를 통해 할다와는 경우에Heap이라는 공간에 할당합니다
            //우리는 로우 시스템 개발자가 아니므로 여기서 더 깊게 들어갈 필요는 없습니다.
            //그냥 아! new를 했기 때문에 Heap에 있구나 정도만 알면됩니다

            //그렇다면 궁극적으로 Stack과 Heap의 차이는 무엇인가?
            //Stack은 앞서서 주사위 문제에서도 봤듯이 Loop{final int data}형태가 있다면
            //data변수가 루프마다 초기화되는 것을 볼수 있습니다.
            //이런 지역변수 특성을 가지는 녀석들은 죄다 Stack 입니다.

            //반면new를 해서 Heap에 설정되는 정보들응ㄴ 메모리에 상주하게 됩니다.
            //그러므로 언제 어디서든 데이터에 접근할 수 있게 됩니다.
            //자바 개발자에게 있어 둘의 차이점이라면 현제 이내용이 가장 크다 볼 수 있겠습니다

            //결론 Stack은 중괄호{} 내에서 사용됨
            //  Heap은 new하고 이후로 사용됨

            //배열의 경우 아래와 같이 numberArray.length 형태로 전체 길이를 파악할 수 있습니다.
            System.out.println("배열 출력: " + numberArray[i]);
            //배열이라는 녀석은 메모리 공간상에 순차적으로 배치됩니다.
            //메모리 공간이라는 것이 생소 하다면
            //아래와 같은 박스들이 일열로 나열되어 있는 상황을 생각해도됩니다.

            //  0  1   2   3   4
            //[ ] [ ] [ ] [ ] [ ]

            //주위할 부분이라면 배열의 시작잉 0부터 라는 것에 주의를 해주세요.
            //우리는 1부터100까지 라고 말하지만 배열은 0부터 99 까지 움직이게 됩니다.

            //final int[] numberArray[0]은 숫자 1을 표현하고
            //numberArray[1]는 숫자2
            //numberArray[2]는 숫자3
            //numberArray[3]는 숫자4
            //numberArray[4]는 숫자5

            //위 형대로 동작하여 for루프에서
            //1값이 증가함에 따라 모든 배열의 원소들을 출력하게 됩니다.
        }
        //for의 변형 버전 foreach 라고도 이야기함
        //foreach 사용법
        //1.배열의 데이터 타입을 작성합니다. (여기선int)
        //2. 배열의 원소를 표현할 이름을 적당히 지정합니다. (여기선num)
        //3. 콜론 하나 찍습니다.(;)
        //4. 정보를 하나씩 꺼내 올 배열을 적어줍니다.(여기선 numberArray)
        for (int num : numberArray){
            System.out.println("배열 원소 출력" + num);
        }
        //비지니스가 확장됨에 따라 서비르가 커졌고
        //그에 따라 데이터와 규모가 커졌다 (여기서 배열에 정보가 많다고 가정)
        //이런 상황에서 for (초기화; 조건; 증감)과 foreach가 있다면 누가 더 좋을까?

        //첫 번째 - 이유 ->초기화나 조건들이 있어 향우 변졍에 유리하다 생각됨
        //두 번째 - 이유 -> 전자는 계속 조건식을 검사해야함

        //이런 이유때문에 사실 데이터를 요구하면 뭉태기로 한 번에 쏘지 않고 필요한 정보만 선별해서 쏘게 됩니다.
        //가령 aws에서 1000만명 분량의 데이터를 검색 한 번에 다 가져오게되면 요금 폭탄으로 회사 망합니다.
        //그래서 서비스 관점에선 이런 조각 내기 개념으로서 페이징(Paging)이라는 것을 합니다
        //os 레벨에서 이야기에서 이야기 하는 Paging과는 다른 개념이니 주의합시다!
        //(여기서 이야기하는 Paging은 데이터 조각내기 관점이라 보면 됩니다.)
    }
}