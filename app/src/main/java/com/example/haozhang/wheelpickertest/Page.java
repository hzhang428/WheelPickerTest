package com.example.haozhang.wheelpickertest;

import com.bigkoo.pickerview.model.IPickerViewData;

/**
 * Created by haozhang on 7/20/17.
 *
 */

public class Page implements IPickerViewData{

    private int id;
    private String pageNumber;

    public Page(int id, String pageNumber) {
        this.id = id;
        this.pageNumber = pageNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }


    @Override
    public String getPickerViewText() {
        return pageNumber;
    }
}
