package kimura.norihiko.techacademy.qa_app

import android.content.Context
import android.view.LayoutInflater

class QuestionDetailListAdapter (context: Context, private val mQuestion: Question) {
    companion object {
        private val TYPE_QUESTION = 0
        private val TYPE_ANSWER = 1
    }

    private var mLayoutInflater: LayoutInflater? = null

    init {
        mLayoutInflater = context.getSystemService(Context)
    }
}