
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fifa.AdapterClass.GrpupsAdapter
import com.example.fifa.DataModalClass.GroupsData
import com.example.fifa.R
class Groups : Fragment() {


    //make list and recyclerview
    val list = ArrayList<GroupsData>()
    lateinit var res:RecyclerView

    // inflate the layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_groups, container, false)!!


        res = view.findViewById(R.id.resgg)
        getdata()


         //set layout
        res.setLayoutManager(LinearLayoutManager(context))
        return view
    }

    private fun getdata() {

        //add data in list
        list.add(GroupsData("Group A",
            1,R.drawable.qater,"Qatar",
            2, R.drawable.flag2,"Ecuador",
            3, R.drawable.flag3,"Senegal",
            4, R.drawable.flag4,"Netherlands"))



        list.add(GroupsData("Group B",
            1, R.drawable.england,"England",
            2, R.drawable.flag6,"IR Iran",
            3, R.drawable.flage8,"USA",
            4, R.drawable.flag9,"Wales"))


        list.add(GroupsData("Group C",
            1, R.drawable.flag10,"Argentina",
            2, R.drawable.sudia,"Saudi Arabia",
            3, R.drawable.flag12,"Mexico",
            4, R.drawable.flag13,"Poland"))


        list.add(GroupsData("Group D",
            1, R.drawable.flag16,"Denmark",
            2, R.drawable.flag17,"Tunisia",
            3, R.drawable.flag15,"Australia",
            4, R.drawable.flag14,"France"))


        list.add(GroupsData("Group E",
            1, R.drawable.flag18,"Spain",
            2, R.drawable.flag21,"Germany",
            3, R.drawable.flag22,"Japan",
            4, R.drawable.flag20,"Costa Rica"))


        list.add(GroupsData("Group F",
            1, R.drawable.flag24,"Belgium",
            2, R.drawable.flag25,"Canada",
            3, R.drawable.flag27,"Morocco",
            4, R.drawable.flag29,"Croatia"))

        list.add(GroupsData("Group G",
            1, R.drawable.glag30,"Brazil",
            2, R.drawable.flag31,"Serbia",
            3, R.drawable.flag33,"Switzerland",
            4, R.drawable.flag38,"Cameroon"))



        list.add(GroupsData("Group H",
            1, R.drawable.flag35,"Portugal",
            2, R.drawable.flag123,"Ghana",
            3, R.drawable.flag36,"Uruguay",
            4, R.drawable.flag41,"Korea Republic"))















        //set adapter
        val adapterClass = GrpupsAdapter(list,this)
        res.setAdapter(adapterClass)
    }


}

