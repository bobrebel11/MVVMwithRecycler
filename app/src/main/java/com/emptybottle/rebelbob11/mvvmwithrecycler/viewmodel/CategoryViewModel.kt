package com.emptybottle.rebelbob11.mvvmwithrecycler.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emptybottle.rebelbob11.mvvmwithrecycler.model.Category

class CategoryViewModel: ViewModel
{

    var id = ""
    var title = ""
    var desc = ""
    var imagePath = ""

    constructor() : super()

    //Secondary Constructor
    constructor(category: Category) : super() {
        this.id = category.id
        this.title = category.title
        this.desc = category.desc
        this.imagePath = category.imagePath
    }

    var arrayListMutableLivedata = MutableLiveData<ArrayList<CategoryViewModel>>()

    var arrayList = ArrayList<CategoryViewModel>()

    fun getArrayList():MutableLiveData<ArrayList<CategoryViewModel>>{

        val category1 = Category("1","title 1","This is first 1","image.png")

        val category2 = Category("2","title 2","This is first 2","image.png")

        val categoryViewModel1: CategoryViewModel = CategoryViewModel(category1)
        val categoryViewModel2: CategoryViewModel = CategoryViewModel(category2)

        arrayList!!.add(categoryViewModel1)
        arrayList!!.add(categoryViewModel2)

        arrayListMutableLivedata.value = arrayList



        return arrayListMutableLivedata
    }


}