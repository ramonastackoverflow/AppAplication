package make.appaplication;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyFragment extends Fragment {

    View view;

    public static MyFragment newInstance(DataModel data) {

        MyFragment fragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("data",data);
        fragment.setArguments(bundle);
        return fragment;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_4, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        DataModel model = (DataModel) getArguments().getSerializable("data");
        Log.e("MyFragment", "Question = " + model.getQuestion());

        TextView txtModel = (TextView)getView().findViewById(R.id.txtFragment);
        txtModel.setText(model.getQuestion());
    }
}



