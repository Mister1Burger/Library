package home.rxjavatest;


import android.app.ProgressDialog;
import android.content.Context;
import android.view.Window;

public class MySpinner {

  private ProgressDialog spinner;

    public MySpinner(Context context){

            spinner = new ProgressDialog(context, R.style.AppCompatAlertDialogStyle);
            spinner.requestWindowFeature(Window.FEATURE_NO_TITLE);
            spinner.setMessage("Loading...");
            spinner.setCanceledOnTouchOutside(false);
    }

    public ProgressDialog getSpinner() {
        return spinner;
    }
}
