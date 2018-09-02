package com.emptybottle.rebelbob11.mvvmwithrecycler.model

class Category{

    var id = ""
    var title = ""
    var desc = ""
    var imagePath = ""

    constructor(id: String, title: String, desc: String, imagePath: String) {
        this.id = id
        this.title = title
        this.desc = desc
        this.imagePath = imagePath
    }
}