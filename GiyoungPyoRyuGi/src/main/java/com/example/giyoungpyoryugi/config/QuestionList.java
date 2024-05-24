package com.example.giyoungpyoryugi.config;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Getter
public class QuestionList {
    private final List<String> questionList = Arrays.asList(
            "어린 시절 부모님과 가장 기억에 남는 추억은 무엇인가요?", //0
            "부모님은 학창시절 때 어떤 학생이었을것 같나요?", //1
            "친구들과 함께한 재미있는 에피소드가 있나요?", //2
            "첫인상이 가장 인상깊은  사람은 누구인가요?", //3
            "부모님과의 기억 중 가장 행복한 기억은 무엇인가요?",
            "인생에서 가장 어려웠던 순간은 언제였나요? 그리고 어떻게 극복 했나요?",
            "지금까지 살면서 가장 후회되는 일이 있다면 무엇인가요?",
            "당신이 인생에서 가장 자랑스러웠던 순간은 언제인가요?",
            "5년전으로  돌아갈 수 있다면, 무엇을 가장 하고 싶나요?",
            "우리 가족에게 말해주고 싶은 가장 중요한 교훈은 무엇인가요?",
            "첫사랑 이야기를 해주세요!",
            "지금 연인 or 좋아하는 사람이 있나요? 있다면 설명해주세요",
            "가족과 함께 보낸 특별한 순간이 있다면 이야기해 주세요.",
            "부모님이 당신을 키우면서 가장 힘들었던 순간은 언제일꺼라고 생각하나요?",
            "미래에 어떤 부모님이 되고 싶으신가요?",
            "처음 시작한 직업은 무엇이었나요? 그리고 그 일에 대한 기억은?",
            "부모님이 가장 좋아하는 취미는 무엇인가요?",
            "머나먼 이야기 이긴 하지만, 은퇴 후 하고 싶은 일이 있다면 무엇인가요?",
            "지금까지 살아가면서  배운 가장 중요한 교훈은 무엇인가요?",
            "여가 시간에는 주로 무엇을 하시나요?",
            "현재 부모님의 가장 큰 관심사는 무엇인것 같나요?",
            "앞으로의 인생에서 계획이나 목표가 있다면 무엇인가요?",
            "가족 모두에게 바라는 소망이 있다면 무엇인가요?",
            "앞으로 부모님과 꼭 해보고 싶은 일이 있다면 무엇인가요?",
            "부모님이 생각하는 행복이란 무엇인가요?"
    );

    public List<String> pickRandomQuestion(){
        List<String> randomQuestionList = new ArrayList<>();
        Random random = new Random();
        int num1 = random.nextInt(questionList.size());
        int num2 = random.nextInt(questionList.size());
        while (num1 != num2){
            num2 = random.nextInt(questionList.size());
        }
        randomQuestionList.add(questionList.get(num1));
        randomQuestionList.add(questionList.get(num2));
        return randomQuestionList;
    }
}
