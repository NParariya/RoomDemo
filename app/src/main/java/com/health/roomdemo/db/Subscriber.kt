package com.health.roomdemo.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subscriber_data_table")
data class Subscriber (
    @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        val id : Int,

        @ColumnInfo(name = "name")
        val name :String,

        @ColumnInfo(name = "email")
        val email : String
        )
