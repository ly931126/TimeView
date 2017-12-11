package com.example.liye.timeview;

import android.graphics.drawable.Drawable;

/**
 * Created by liye on 2017/11/29.
 */

public class ResultViewModel {
	
	private String		mTimeStr;
	private String		mDateStr;
	private Drawable	mMealDrawable;
	private String		mResultStr;
	private String		mRangeStr;
	
	public ResultViewModel(String timeResId, String dateStr, Drawable mealDrawable, String resultStr, String rangeStr) {
		mTimeStr = timeResId;
		mDateStr = dateStr;
		mMealDrawable = mealDrawable;
		mResultStr = resultStr;
		mRangeStr = rangeStr;
	}
	
	public String getTimeStr() {
		return mTimeStr;
	}
	
	public void setTimeStr(String timeStr) {
		mTimeStr = timeStr;
	}
	
	public String getDateStr() {
		return mDateStr;
	}
	
	public void setDateStr(String dateStr) {
		mDateStr = dateStr;
	}
	
	public Drawable getMealDrawable() {
		return mMealDrawable;
	}
	
	public void setMealDrawable(Drawable mealDrawable) {
		mMealDrawable = mealDrawable;
	}
	
	public String getResultStr() {
		return mResultStr;
	}
	
	public void setResultStr(String resultStr) {
		mResultStr = resultStr;
	}
	
	public String getRangeStr() {
		return mRangeStr;
	}
	
	public void setRangeStr(String rangeStr) {
		mRangeStr = rangeStr;
	}
}
