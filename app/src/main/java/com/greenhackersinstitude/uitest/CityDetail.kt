package com.greenhackersinstitude.uitest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.city_scrolling.*
import kotlinx.android.synthetic.main.fragment_city_detail.*

/**
 * A simple [Fragment] subclass.
 */
class CityDetail : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_city_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tabs.addTab(tabs.newTab().setText("Overview"))
        tabs.addTab(tabs.newTab().setText("Photos"))
        tabs.addTab(tabs.newTab().setText("Reviews"))

        imgToolbar.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()
        }
        tabs.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(p0: TabLayout.Tab?) {
                when {
//                    p0?.position == 0 -> loadFragment(Home())
//                    p0?.position == 1 -> loadFragment(Korea())
//                    p0?.position == 2 -> loadFragment(Movies())
                }
            }

            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }


        })
    }


}
