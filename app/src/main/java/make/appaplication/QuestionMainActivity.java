package make.appaplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reniek on 2017-09-28.
 */



/*public class QuestionMainActivity extends AppCompatActivity {



        private static final int NUMBER_OF_QUESTIONS = 3;
        static boolean[] answer = new boolean[NUMBER_OF_QUESTIONS];
        static boolean[] checked = new boolean[NUMBER_OF_QUESTIONS];
        static boolean[] isAnswered = new boolean[NUMBER_OF_QUESTIONS];

        private ViewPager viewPager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            viewPager = (ViewPager) findViewById(R.id.fragment_container);

            //Add data for your mode here
            ArrayList<DataModel> list = new ArrayList<>();
            for (int i = 0; i < 10; i++)
            {
                ArrayList<String> option = new ArrayList<>();
                list.add(new DataModel("imageUri " +i, "Question " + i, option));
            }

            //pass that data to your fragment as below
            ArrayList<MyFragment> fragments = new ArrayList();
            for(DataModel model : list) {
                fragments.add(MyFragment.newInstance(model));

            }

            MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), fragments);
            viewPager.setAdapter(adapter);
        }

        public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {

            private List<MyFragment> listFragments;

            public MyFragmentPagerAdapter(FragmentManager fm, List<MyFragment> fragments) {
                super(fm);
                this.listFragments = fragments;
            }

            @Override
            public Fragment getItem(int position) {
                return listFragments.get(position);
            }

            @Override
            public int getCount() {
                return listFragments.size();
            }

            public int getItemPosition(Object object) {
                return POSITION_NONE;
            }
        }
    }



*/
