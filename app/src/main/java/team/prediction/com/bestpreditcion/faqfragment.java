package team.prediction.com.bestpreditcion;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class faqfragment extends Fragment {
    ListView lv;
    ArrayList<String> a1;
    ArrayAdapter<String> aa;
public faqfragment()
{

}
@Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View view=inflater.inflate(R.layout.fragment_faqfragment,container,false);
//just change the fragment_dashboard
lv=(ListView) view.findViewById(R.id.mainmenu);
a1=new ArrayList<String>();
aa= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_activated_1,a1);
lv.setAdapter(aa);
a1.add("About Us");
a1.add("Contact Us");
    a1.add("Join Whats app");
    a1.add("Tips");
    a1.add("Privacy Policy");
    a1.add("Terms and Condition");
    a1.add("Rate Us");
    a1.add("FAQ");
    a1.add("Success");
lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String s=a1.get(position);
        MainActivity mn1=(MainActivity)getActivity();

        mn1.f1(s);
    }
});
    return  view;
        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard
       // return inflater.inflate(R.layout.fragment_faqfragment, null);
/*final String[] faq1 ={"About Us",
        "Contact US",
        "Join Whats app ",
        "Tips",
        "Privacy Policy",
        "Terms and Condition",
        "Rate Us",
        "FAQ"
*/
};
 //   ListView listView =(ListView) view.findViewById(R.id.mainmenu);
   // ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(),
    //android.R.layout.simple_list_item_1,
      //      faq1);
    //listView.setAdapter(listViewAdapter);
    //lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){


      //  @Override
        //public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
          //  String s= faq1.get();
            //    MainActivity mn1=  (MainActivity) getActivity();
              //  mn1.f1(s);
     //   }
   // });





    }

