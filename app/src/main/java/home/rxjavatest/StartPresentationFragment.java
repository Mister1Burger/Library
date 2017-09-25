package home.rxjavatest;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StartPresentationFragment extends Fragment {

    private MainActivity activity;
    private Runnable characterAdder;

    @BindView(R2.id.text_h)
    TextView text;
    @BindView(R2.id.btn_next)
    Button next;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start_presentation, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        activity = (MainActivity) getActivity();
        animateText("Hello, Mr. " + "Test" + "! It’s good to see you.",
                text, 150);
        next.setOnClickListener(view1 -> {});
    }


    public void animateText(final CharSequence text, final TextView tv, final long mDelay) {

        final Handler mHandler = new Handler();

        final int[] mIndex = {0};

        characterAdder = () -> {
            tv.setText(text.subSequence(0, mIndex[0]++));
            if (mIndex[0] <= text.length()) {
                mHandler.postDelayed(characterAdder, mDelay);
            }
        };

        tv.setText("");
        mHandler.removeCallbacks(characterAdder);
        mHandler.postDelayed(characterAdder, mDelay);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
