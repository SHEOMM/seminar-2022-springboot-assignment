package com.wafflestudio.seminar.user.database

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


interface UserRepository : JpaRepository<UserEntity, Long> {
    fun findByEmail(email: String): UserEntity?
}