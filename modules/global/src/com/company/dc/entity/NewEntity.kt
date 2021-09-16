package com.company.dc.entity

import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Table

@Table(name = "DC_NEW_ENTITY")
@javax.persistence.Entity(name = "dc_NewEntity")
open class NewEntity : StandardEntity() {
    companion object {
        private const val serialVersionUID = -699275635316187158L
    }
}