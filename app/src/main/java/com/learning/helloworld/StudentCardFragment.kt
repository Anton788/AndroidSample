package com.learning.helloworld

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import java.io.File
import java.lang.ref.WeakReference

class StudentCardFragment : Fragment() {

    companion object {
        const val FIRST_NAME : String ="firstname_default"
        const val LAST_NAME : String ="lastname_default"

        fun newInstance(student:Student): StudentCardFragment = StudentCardFragment().apply {
            arguments = Bundle().apply {
                putString(FIRST_NAME, student.firstName)
                putString(LAST_NAME, student.lastName)
            }
        }
    }
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view  = inflater.inflate(R.layout.card, container, false)
        val nameText = view.findViewById<TextView>(R.id.cardName)
        val secondName = view.findViewById<TextView>(R.id.cardKafedra)
        nameText.setText(arguments?.getString(FIRST_NAME))
        secondName.setText(arguments?.getString(LAST_NAME))
        return view
    }

}
