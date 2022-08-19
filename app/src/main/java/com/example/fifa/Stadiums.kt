
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fifa.AdapterClass.StadiumsAdapter
import com.example.fifa.DataModalClass.Stadiumdata
import com.example.fifa.R
class Stadiums : Fragment() {


    //make list and recyclerview
    val list = ArrayList<Stadiumdata>()
    lateinit var res:RecyclerView

    // inflate the layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_stadiums, container, false)!!


        res = view.findViewById(R.id.resstadiums)
        getdata()


        //set layout
        res.setLayoutManager(LinearLayoutManager(context))
        return view
    }

    private fun getdata() {

        //add data in list
        //1
        list.add(Stadiumdata(
            R.drawable.std1111,"Al Bayt Stadium","This distinctive and uniquely Qatari stadium is set to rival the best in the world. Fans arriving at the 60,000-capacity arena, which will be covered with a giant tent-like structure, are certainly unlikely to have seen anything like it. The stadium takes its name from bayt al sha'ar – tents historically used by nomadic peoples in Qatar and the Gulf region. And like a true nomad's tent, it will be portable. Qatar's Supreme Committee for Delivery and Legacy (SC) plans to remove the upper tier of modular design seating following the 2022 FIFA World Cup™ and give it to developing nations in need of sporting infrastructure, forming part of the tournament’s legacy.\n" +
                    "\n" +
                    "The stadium design honours Qatar's past and present, while keeping one eye on the future of the community. With the sustainability goals of this World Cup firmly in mind, it will be a model of green development, surrounded by facilities for the local area.",
        "Fact file","Official name: Al Bayt Stadium, Al Khor City\n" +
                    "Opened: TBD\n" +
                    "Capacity: 60,000","201006_Al Bayt Stadium Interiors")
        )

        //2
        list.add(Stadiumdata(
            R.drawable.std22,"Khalifa International Stadium","Al Rayyan’s much-loved Khalifa International Stadium is Qatar’s most" +
                    " historic football venue, having hosted the Asian Games, the Gulf Cup, the AFC Asian Cup and five matches of the 2019 FIFA Club" +
                    " World Cup, including the Final between Liverpool and Flamengo. Built in 1976, a new chapter in the stadium’s storied past " +
                    "was written in 2017 when it reopened after renovation and hosted the final of the Emir Cup, where FIFA World Cup™ winner" +
                    " Xavi’s Al-Sadd triumphed. The ultra-modern revamp, however, still honours the past with the stadium’s iconic dual arches" +
                    " continuing to sweep the skyline.",
            "Fact file","Official name: Khalifa International Stadium\n" +
                    "Opened: 1976\n" +
                    "Last renovated: 2017\n" +
                    "Capacity: 45,416","DOHA, QATAR - MARCH 29")
        )




         //3
        list.add(Stadiumdata(
            R.drawable.std33,"Al Thumama Stadium","Based on the design of traditional Arabic headwear, the gahfiya," +
                    " the stadium aims to radiate the culture of the country and region with its intricately designed exterior. " +
                    "A short 12km journey south from central Doha, Al Thumama Stadium is named after a native tree which can be found" +
                    " growing in the area. Designed by Qatari architect Ibrahim M.Jaidah, following the 2022 FIFA World Cup™, Qatar's" +
                    " Supreme Committee for Delivery and Legacy (SC) plans to convert it from a 40,000-seater into a 20,000 capacity stadium, " +
                    "housing a sports clinic and hotel.",
            "Fact file","Official name: Al Thumama Stadium\n" +
                    "Opened: TBD\n" +
                    "Capacity: 40,000","200830_Al Thumama Stadium Aerials")
        )



        //4
        list.add(Stadiumdata(
            R.drawable.st44,"Ahmad bin Ali Stadium","Due to its location on the edge of the desert, preserving nature has" +
                    " long been a priority in Al Rayyan – and this arena fits perfectly with the ethos of one of Qatar’s" +
                    " most traditional cities. Every part of the stadium district has been designed with sustainability " +
                    "in mind. After the 2022 FIFA World Cup Qatar™ has come to a close, Qatar's Supreme Committee for Delivery " +
                    "and Legacy (SC) plans to remove almost half of the stadium's 40,000 modular seats and give them to football" +
                    " development projects abroad.\n" +
                    "\n" +
                    "The smaller post-tournament arena, meanwhile, will continue to take pride of place in Al Rayyan, particularly" +
                    " among fans of the much-loved local football team, Al Rayyan Sports Club. Built on the site of club’s former " +
                    "ground, the Ahmad Bin Ali Stadium incorporates symbols of Qatari culture into its spectacular undulating façade," +
                    " while the surrounding facilities and sand dune-shaped structures also reflect the surrounding land.",
            "Fact file","Official name: Ahmad Bin Ali Stadium\n" +
                    "Opened: 18 December 2020\n" +
                    "Capacity: 40,000","DOHA, QATAR - DECEMBER 04: During the FIFA Arab Cup Qatar 2021")
        )



        //5
        list.add(Stadiumdata(
            R.drawable.std55,"Lusail Stadium","The Lusail Stadium is set to be a " +
                    "historic venue for a plethora of reasons. It will be the largest stadium by capacity" +
                    " at the first FIFA World Cup™ hosted in the Gulf, it will be the centrepiece of a brand " +
                    "new metropolis named Lusail City, and its legacy after the global finals will see the stadium’s" +
                    " infrastructure converted into a community space including schools, shops, cafés, sporting facilities and health clinics.\n" +
                    "\n" +
                    "To spread the legacy of Qatar 2022 around the world after the finals have " +
                    "concluded, Qatar's Supreme Committee for Delivery and Legacy (SC) plans to remove and donate" +
                    " most of the stadium's 80,000 seats to sporting projects across the globe.\n" +
                    "\n" +
                    "With a design which alludes to the decorative motifs on bowls found across the Arab world," +
                    " the Lusail Stadium will surely host up a feast of football for fans from across the planet in 2022.",
            "Fact file","Official name: Lusail Stadium\n" +
                    "Opened: TBD\n" +
                    "Capacity: 80,000","December 16, 2021 in Lusail, Qatar")
        )

        //6


        list.add(Stadiumdata(
            R.drawable.std66,"Stadium 974","Undoubtedly one of the most innovative FIFA World Cup™ stadium designs ever," +
                    " the Stadium 974 will be constructed using shipping containers, removable seats and other modular ‘building blocks’." +
                    " Further to its innovative structure, Qatar's Supreme Committee for Delivery and Legacy (SC) plans to dismantle the stadium" +
                    " entirely after the conclusion of the global finals, with the parts repurposed for use in other projects, giving a whole new" +
                    " meaning to the word 'legacy'.\n" +
                    "\n" +
                    "The SC also plans to renovate the site of the stadium itself into a dazzling waterfront development for the local community " +
                    "in Doha’s West Bay to enjoy for years to come.",
            "Fact file","Official name: Stadium 974\n" +
                    "Opened: TBD\n" +
                    "Capacity: 40,000","DOHA, QATAR - DECEMBER 03: General photo of the 974" +
                    " stadium from the inside during the FIFA Arab Cup Qatar 2021")
        )




         ///7
        list.add(Stadiumdata(
            R.drawable.std77,"Education City Stadium","A vibrant centre of knowledge, Doha’s Education City Stadium can be " +
                    "found amid several leading universities. The area is home to the Qatar Foundation for Education, Science and Community " +
                    "Development, with academia and innovation at the heart of the community’s ethos. Though it will boast a 40,000 capacity" +
                    " during the FIFA World Cup™, Qatar's Supreme Committee for Delivery and Legacy (SC) plans to donate 20,000 seats to build" +
                    " stadiums in developing countries. Upon arrival, fans will see plenty of green spaces and state-of-the-art amenities surrounding" +
                    " the venue, all built with an eye on sustainability and the future.",
            "Fact file","Official name: Education City Stadium\n" +
                    "Completed: 2020\n" +
                    "Capacity: 40,000"
                    ,"200102_Education City Stadium Aerials")
        )


        //8
        list.add(Stadiumdata(
            R.drawable.std88,"Al Janoub Stadium","Al Janoub Stadium burst into life as it was unveiled to the world in spectacular style," +
                    " being inaugurated with the 2019 Emir Cup final as Al Duhail lifted the trophy beneath a sky awash with triumphant fireworks. Found " +
                    "in the coastal city of Al Wakrah – situated just south of capital Doha – the area’s connection with the sea, having been formerly" +
                    " known as a pearling village, influenced the flowing design of the striking stadium’s exterior, which was developed in conjunction" +
                    " with the world famous Zaha Hadid Architects.",
            "Fact file","Official name: Al Janoub Stadium\n" +
                    "Opened: 2019\n" +
                    "Capacity: 40,000"
            ,"DOHA, QATAR - MARCH 28:   A general view inside the Al Janoub" +
                    " Stadium on March 28, 2022 in Doha, Qatar")
        )























        //set adapter
        val adapterClass =StadiumsAdapter(list,this)
        res.setAdapter(adapterClass)
    }


}

