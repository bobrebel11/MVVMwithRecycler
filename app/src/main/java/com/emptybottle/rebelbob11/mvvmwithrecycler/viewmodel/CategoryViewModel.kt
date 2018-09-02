package com.emptybottle.rebelbob11.mvvmwithrecycler.viewmodel

import androidx.lifecycle.ViewModel
import com.emptybottle.rebelbob11.mvvmwithrecycler.model.Category

class CategoryViewModel: ViewModel
{

    var id = ""
    var title = ""
    var desc = ""
    var imagePath = ""

    constructor() : super()

    constructor(category: Category) : super() {
        this.id = category.id
        this.title = category.title
        this.desc = category.desc
        this.imagePath = category.imagePath
    }


}