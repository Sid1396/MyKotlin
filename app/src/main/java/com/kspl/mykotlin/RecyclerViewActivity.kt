package com.kspl.mykotlin

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.view.animation.LayoutAnimationController
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {


    lateinit var list: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        list = findViewById(R.id.list)
        list.layoutManager = LinearLayoutManager(this)


        val dummylist = mutableListOf<DataClass>()

        var dataClass = DataClass(1, 1)
        dummylist.add(dataClass)
        dataClass = DataClass(2, 2)
        dummylist.add(dataClass)
        dataClass = DataClass(2, 3)
        dummylist.add(dataClass)
        dataClass = DataClass(2, 4)
        dummylist.add(dataClass)
        dataClass = DataClass(1, 5)
        dummylist.add(dataClass)


//        val list = ArrayList<DataClass>().apply {
//            add(DataClass(1,2))
//        }


        val adaptor = Adaptor(this, dummylist)
        list.adapter = adaptor



//        var resId :Int = R.anim.slide_in_right
//        var animation = AnimationUtils.loadLayoutAnimation(this, resId)
//        list.setLayoutAnimation(animation);
//        list.scheduleLayoutAnimation()


        fab.setOnClickListener {
            intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }


    }


}
