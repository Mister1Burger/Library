package home.rxjavatest;


import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;

public class RxViewEvents {

    public static Observable<String> getTextChangeObservable(TextView editText) {

        final Subject<String> subject = BehaviorSubject.create();

        subject.onNext(editText.getText().toString());

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                subject.onNext(s.toString());
            }
        });

        return subject.publish().autoConnect().doOnSubscribe(disposable -> subject.onNext(editText.getText().toString()));

    }

}
