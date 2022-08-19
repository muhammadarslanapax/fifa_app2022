
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fifa.AdapterClass.WinnerAdapter
import com.example.fifa.DataModalClass.WinnersData
import com.example.fifa.R
class Titles: Fragment() {


    //make list and recyclerview
    val list = ArrayList<WinnersData>()
    lateinit var res:RecyclerView

    // inflate the layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_titles, container, false)!!


        res = view.findViewById(R.id.restitles)
        getdata()


        //set layout
        res.setLayoutManager(LinearLayoutManager(context))
        return view
    }

    private fun getdata() {

        //add data in list
        list.add(WinnersData(R.drawable.flag36,"Uruguay","1930"))
        list.add(WinnersData(R.drawable.italy," Italy","1934"))
        list.add(WinnersData(R.drawable.italy," Italy","1938"))
        list.add(WinnersData(R.drawable.flag36,"Uruguay","1950"))
        list.add(WinnersData(R.drawable.flag21,"Germany FR","1954"))
        list.add(WinnersData(R.drawable.glag30,"Brazil","1958"))


        list.add(WinnersData(R.drawable.glag30,"Brazil","1962"))
        list.add(WinnersData(R.drawable.england,"England","1966"))
        list.add(WinnersData(R.drawable.flag14,"Brazil","1970"))
        list.add(WinnersData(R.drawable.flag21,"Germany FR","1974"))
        list.add(WinnersData(R.drawable.flag10,"Argentina","1978"))
        list.add(WinnersData(R.drawable.italy,"Italy","1982"))


        list.add(WinnersData(R.drawable.flag15,"Argentina","1986"))
        list.add(WinnersData(R.drawable.flag21,"Germany FR","1990"))
        list.add(WinnersData(R.drawable.glag30," Brazil","1994"))
        list.add(WinnersData(R.drawable.flag14,"France","1998"))
        list.add(WinnersData(R.drawable.glag30,"Brazil","2002"))
        list.add(WinnersData(R.drawable.italy,"Italy","2006"))


        list.add(WinnersData(R.drawable.flag18,"Spain","2010"))
        list.add(WinnersData(R.drawable.flag21,"Germany","2014"))
        list.add(WinnersData(R.drawable.flag14,"France ","2018"))

















        //set adapter
        val adapterClass =WinnerAdapter(list,this)
        res.setAdapter(adapterClass)
    }


}

