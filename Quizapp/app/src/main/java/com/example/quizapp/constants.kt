package com.example.quizapp

object Constants{
    const val USER_NAME : String="username"
    const val TOTAL_QUESTIONS: String="Total Quaestion"
    const val CORRECT_ANSWERS: String="correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 =Question(1,"What country does this flag belong to ?",
        R.drawable.india,"Ireland","India","Pakistan","Sri Lanka",2)
        questionsList.add(que1)
        val que2 =Question(1,"What country does this flag belong to ?",
            R.drawable.srilanka,"Ireland","India","Pakistan","Sri Lanka",4)
        questionsList.add(que2)
        val que3 =Question(1,"What country does this flag belong to ?",
            R.drawable.jamaica,"Jamaica","India","Pakistan","Sri Lanka",1)
        questionsList.add(que3)

        val que4 =Question(1,"What country does this flag belong to ?",
            R.drawable.australia,"Ireland","India","Australia","Sri Lanka",3)
        questionsList.add(que4)
        val que5 =Question(1,"What country does this flag belong to ?",
            R.drawable.afghanistan,"Ireland","India","Pakistan","None",4)
        questionsList.add(que5)
        return questionsList
    }
}