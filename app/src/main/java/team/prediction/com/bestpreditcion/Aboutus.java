package team.prediction.com.bestpreditcion;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Aboutus extends Fragment {
TextView t;
public Aboutus(){

}
@Override
 public  View onCreateView(LayoutInflater inflater,ViewGroup container,
                           Bundle savedInstanceState){
    View v= inflater.inflate(R.layout.fragment_aboutus, container, false);
    t=(TextView) v.findViewById(R.id.textView2);
Bundle b=getArguments();
if(b!=null)
{
    String s=b.getString("s");
    t.setText(s);
}
     return  v;
}
}
