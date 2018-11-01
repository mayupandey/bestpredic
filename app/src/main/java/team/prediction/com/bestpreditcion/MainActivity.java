package team.prediction.com.bestpreditcion;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    private ActionBar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // loadFragment(new predictionfargment());
        BottomNavigationView navigation = findViewById(R.id.navigation);
     //   navigation.setOnNavigationItemSelectedListener(this);
        navigation.setOnNavigationItemSelectedListener(navListener);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new predictionfargment()).commit();
        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            selectedFragment = new predictionfargment();
                            break;
                        case R.id.navigation_dashboard:
                            selectedFragment = new faqfragment();
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

    public void f1(String s) {
        FragmentManager m=getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft=m.beginTransaction();
        Aboutus a=new Aboutus();
        predictionfargment a1= new predictionfargment();
        Bundle b=new Bundle();
        Bundle b2= new Bundle();
        b.putString("s",s);
      a.setArguments(b);
      a1.setArguments(b2);
      ft.replace(R.id.fragment_container,a);
      ft.commit();
    }
}










































/*   private boolean loadFragment(Fragment fragment) {
        // load fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment=null;
        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                toolbar.setTitle("Prediction");
                fragment = new predictionfargment();
                loadFragment(fragment);
                break;
            case R.id.navigation_dashboard:
                toolbar.setTitle("FAQ");
                fragment = new faqfragment();
                loadFragment(fragment);
                break;
        }
        return loadFragment(fragment);
    }
}

*/