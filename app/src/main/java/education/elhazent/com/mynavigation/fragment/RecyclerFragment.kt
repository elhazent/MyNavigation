package education.elhazent.com.mynavigation.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import education.elhazent.com.mynavigation.R



/**
 * A simple [Fragment] subclass.
 *
 */
class RecyclerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler, container, false)
    }


}
