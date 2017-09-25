package com.levup.mylibrary;


import android.content.Context;

import java.util.List;

public class ConvertedCurrency {
    Context context;
    CurrencyListView view;

    public ConvertedCurrency(Context context) {
        this.context = context;
        view = new CurrencyListView(context);
    }

    public void addCurrency(ItemListener listener){
        view.setAddListener(listener);
    }

    public void removeCurrency(ItemListener listener){
        view.setRemoveListener(listener);

    }

    public void setList(List<Element> list){

        view.addAll(list);
    }

}
