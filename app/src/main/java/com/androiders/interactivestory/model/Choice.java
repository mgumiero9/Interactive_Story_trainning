package com.androiders.interactivestory.model;

/**
 * Created by mgumiero9 on 21/02/16.
 */
public class Choice {

    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
