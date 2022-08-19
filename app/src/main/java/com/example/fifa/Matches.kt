
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fifa.AdapterClass.MatchAdapter
import com.example.fifa.DataModalClass.MatchData
import com.example.fifa.R
class Matches : Fragment() {


    //make list and recyclerview
    val list = ArrayList<MatchData>()
    lateinit var res:RecyclerView

    // inflate the layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_matches, container, false)!!


        res = view.findViewById(R.id.resmatch)
        getdata()


        //set layout
        res.setLayoutManager(LinearLayoutManager(context))
        return view
    }

    private fun getdata() {

        //add data in list
        //21
        list.add(MatchData("21 November 2022","Khalifa International Stadium,Ar-Rayyan",
            "England",
            "IR Iran",R.drawable.england, R.drawable.flag6,"21 NOV 2022","05 : 00 pm"))

        list.add(MatchData("21 November 2022","Al Thumama Stadium,Doha",
            "Senegal",
            "Netherlands", R.drawable.flag3, R.drawable.flag4,"21 NOV 2022","08 : 00 pm"))
        
        list.add(MatchData("21 November 2022","Ahmad Bin Ali Stadium,Ar-Rayyan",
            "USA",
            "Wales", R.drawable.flage8, R.drawable.flag9,"21 NOV 2022","11 : 00 pm"))




        //22
        list.add(MatchData("22 November 2022","Lusail Stadium,Al Daayen",
            "Argentina",
            "Saudi Arab", R.drawable.flag10, R.drawable.sudia,"22 NOV 2022","02 : 00 pm"))


        list.add(MatchData("22 November 2022","Education City Stadium,Doha",
            "Denmark",
            "Tunisia", R.drawable.flag16, R.drawable.flag17,"22 NOV 2022","05 : 00 pm"))


        list.add(MatchData("22 November 2022","Stadium 974,Doha",
            "Mexico",
            "Poland", R.drawable.flag12, R.drawable.flag13,"22 NOV 2022","08 : 00 pm"))


        list.add(MatchData("22 November 2022","Al Janoub Stadium,Al Wakrah",
            "France",
            "Australia", R.drawable.flag14, R.drawable.flag15,"22 NOV 2022","11 : 00 pm"))


        //23
        list.add(MatchData("23 November 2022","Al Bayt Stadium,Al Khor",
            "Morocco",
            "Croatia", R.drawable.flag27, R.drawable.flag29,"23 NOV 2022","02 : 00 pm"))
        list.add(MatchData("23 November 2022","Khalifa International Stadium,Ar-Rayyan",
            "Germany",
            "Japan", R.drawable.flag21, R.drawable.flag22,"23 NOV 2022","05 : 00 pm"))
        list.add(MatchData("23 November 2022","Al Thumama Stadium,Doha",
            "Spain",
            "Costa Rica", R.drawable.flag18, R.drawable.flag20,"23 NOV 2022","08: 00 pm"))
        list.add(MatchData("23 November 2022","Ahmad Bin Ali Stadium,Ar-Rayyan",
            "Belgium",
            "Canada", R.drawable.flag24, R.drawable.flag25,"23 NOV 2022","11 : 00 pm"))




         //24
        list.add(MatchData("24 November 2022","Al Janoub Stadium,Al Wakrah",
            "Switzerland",
            "Cameroon", R.drawable.flag33, R.drawable.flag29,"24 NOV 2022","02 : 00 pm"))
        list.add(MatchData("24 November 2022","Education City Stadium,Doha",
            "Uruguay",
            "Korea Republic", R.drawable.flag36, R.drawable.flag41,"24 NOV 2022","05 : 00 pm"))
        list.add(MatchData("24 November 2022","Stadium 974,Doha",
            "portugal",
            "Ghana", R.drawable.flag35, R.drawable.flag123,"24 NOV 2022","08: 00 pm"))
        list.add(MatchData("24 November 2022","Lusail Stadium,Al Daayen",
            "Brazil",
            "Serbia", R.drawable.glag30, R.drawable.flag31,"24 NOV 2022","11 : 00 pm"))



         //25
        list.add(MatchData("25 November 2022","Ahmad Bin Ali Stadium,Ar-Rayyan",
            "Wales",
            "Ir Iran", R.drawable.flag9, R.drawable.flag6,"25 NOV 2022","02 : 00 pm"))
        list.add(MatchData("25 November 2022","Al Thumama Stadium,Doha",
            "Qatar",
            "Senegal", R.drawable.qater, R.drawable.flag3,"25 NOV 2022","05 : 00 pm"))
        list.add(MatchData("25 November 2022","Khalifa International Stadium,Ar-Rayyan",
            "Netherlands",
            "Ecuador", R.drawable.flag4, R.drawable.flag2,"25 NOV 2022","08: 00 pm"))
        list.add(MatchData("25 November 2022","Al Bayt Stadium,Al Khor",
            "England",
            "USA", R.drawable.england, R.drawable.flage8,"25 NOV 2022","11 : 00 pm"))




        //26
        list.add(MatchData("26 November 2022","Al Janoub Stadium, Al Wakrah",
            "TUNISIA",
            "AUSTRALIA", R.drawable.flag17, R.drawable.flag15,"26 NOV 2022","02 : 00 pm"))
        list.add(MatchData("26 November 2022","Education City Stadium, Doha",
            "POLAND",
            "SAUDI ARABIA", R.drawable.flag13, R.drawable.sudia,"26 NOV 2022","05 : 00 pm"))
        list.add(MatchData("26 November 2022","Stadium 974, Doha",
            "FRANCE",
            "DENMARK", R.drawable.flag14, R.drawable.flag16,"26 NOV 2022","08: 00 pm"))
        list.add(MatchData("26 November 2022","Lusail Stadium, Al Daayen",
            "ARGENTINA",
            "MEXICO", R.drawable.flag10, R.drawable.flag12,"26 NOV 2022","11 : 00 pm"))



        //27
        list.add(MatchData("27 November 2022","Ahmad Bin Ali Stadium, Ar-Rayyan",
            "JAPAN",
            "COSTA RICA", R.drawable.flag22, R.drawable.flag20,"27 NOV 2022","02 : 00 pm"))
        list.add(MatchData("27 November 2022","Al Thumama Stadium,Doha",
            "BELGIUM",
            "MOROCCO", R.drawable.flag24, R.drawable.flag27,"27 NOV 2022","05 : 00 pm"))
        list.add(MatchData("27 November 2022","Khalifa International Stadium,Ar-Rayyan",
            "CROATIA" ,
            "CANADA", R.drawable.flag29, R.drawable.flag25,"27 NOV 2022","08: 00 pm"))
        list.add(MatchData("27 November 2022","Al Bayt Stadium,Al Khor",
            "SPAIN",
            "GERMANY", R.drawable.flag18, R.drawable.flag21,"27 NOV 2022","11 : 00 pm"))
      //28

        list.add(MatchData("28 November 2022","Al Janoub Stadium, Al Wakrah",
            "Cemeroon",
            "Serbia", R.drawable.flag38, R.drawable.flag31,"28 NOV 2022","02 : 00 pm"))
        list.add(MatchData("28 November 2022","Education City Stadium, Doha",
            "Korea Republic",
            "Ghana", R.drawable.flag41, R.drawable.flag123,"28 NOV 2022","05 : 00 pm"))
        list.add(MatchData("28 November 2022","Stadium 974, Doha",
            "Brazil",
            "Switzerland", R.drawable.glag30, R.drawable.flag33,"28 NOV 2022","08: 00 pm"))
        list.add(MatchData("28 November 2022","Lusail Stadium, Al Daayen",
            "Portugal",
            "Uruguay", R.drawable.flag35, R.drawable.flag36,"26 NOV 2022","11 : 00 pm"))



        //29
        list.add(MatchData("29 November 2022","Al Bayt Stadium,Al Khor",
            "NetherLand",
            "Qatar", R.drawable.flag4, R.drawable.qater,"29 NOV 2022","02 : 00 pm"))

        list.add(MatchData("29 November 2022","Khalifa International Stadium,Ar-Rayyan",
            "Ecuador",
            "Senegal", R.drawable.flag2, R.drawable.flag3,"29 NOV 2022","05 : 00 pm"))

        list.add(MatchData("29 November 2022","Ahmad Bin Ali Stadium,Ar-Rayyan",
            "Wales",
            "England", R.drawable.flag9, R.drawable.england,"29 NOV 2022","08: 00 pm"))
        list.add(MatchData("29 November 2022","Al Thumama Stadium,Doha",
            "Ir Iran",
            "USA", R.drawable.flag6, R.drawable.flage8,"29 NOV 2022","11 : 00 pm"))

        //30
        list.add(MatchData("30 November 2022","Al Janoub Stadium, Al Wakrah",
            "Australia",
            "Denmark", R.drawable.flag15, R.drawable.flag16,"30 NOV 2022","02 : 00 pm"))
        list.add(MatchData("30 November 2022","Education City Stadium, Doha",
            "Tunisia",
            "France", R.drawable.flag17, R.drawable.flag14,"30 NOV 2022","05 : 00 pm"))

        list.add(MatchData("30 November 2022","Stadium 974, Doha",
            "Poland",
            "Argentina", R.drawable.flag13, R.drawable.flag10,"30 NOV 2022","08: 00 pm"))
        list.add(MatchData("30 November 2022","Lusail Stadium, Al Daayen",
            "Saudi Arab",
            "Maxico", R.drawable.sudia, R.drawable.flag12,"30 NOV 2022","11 : 00 pm"))
        //1

        list.add(MatchData("01 December 2022","Ahmad Bin Ali Stadium,Ar-Rayyan",
            "Croatia",
            "Belgium", R.drawable.flag29, R.drawable.flag24,"01 DEC 2022","02 : 00 pm"))
        list.add(MatchData("01 December 2022","Al Thumama Stadium,Doha",
            "Canada",
            "Morocco", R.drawable.flag25, R.drawable.flag27,"01 DEC 2022","05 : 00 pm"))
        list.add(MatchData("01 December 2022","Khalifa International Stadium,Ar-Rayyan",
            "Japan",
            "Spain", R.drawable.flag22, R.drawable.flag18,"01 DEC 2022","08: 00 pm"))

        list.add(MatchData("01 December 2022","Al Bayt Stadium,Al Khor",
            "Costa RIca",
            "Germany", R.drawable.flag20, R.drawable.flag21,"01 DEC 2022","11 : 00 pm"))

        //2

        list.add(MatchData("02 December 2022","Al Janoub Stadium, Al Wakrah",
            "Ghana",
            "Uruguay", R.drawable.flag123, R.drawable.flag36,"02 DEC 2022","02 : 00 pm"))
        list.add(MatchData("02 December 2022","Education City Stadium, Doha",
            "Korea Republic",
            "Portugal", R.drawable.flag41, R.drawable.flag35,"02 DEC 2022","05 : 00 pm"))
        list.add(MatchData("02 December 2022","Stadium 974, Doha",
            "Serbia",
            "Switzerland", R.drawable.flag31, R.drawable.flag33,"02 DEC 2022","08: 00 pm"))
        list.add(MatchData("02 December 2022","Lusail Stadium, Al Daayen",
            "Cameroon",
            "Brazil", R.drawable.flag38, R.drawable.glag30,"02 DEC 2022","11 : 00 pm"))


















        //set adapter
        val adapterClass =MatchAdapter(list,this)
        res.setAdapter(adapterClass)
    }


}

