package com.dailycodebuffer

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Book(
        @Id @GeneratedValue var id: Long,
        var isbn: String,
        var title: String
)