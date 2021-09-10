package com.health.roomdemo.db

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface SubscriberDao {
    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber): Long



}