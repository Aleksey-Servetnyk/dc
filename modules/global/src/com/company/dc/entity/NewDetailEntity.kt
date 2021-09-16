package com.company.dc.entity

import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Table

@Table(name = "DC_NEW_DETAIL_ENTITY")
@javax.persistence.Entity(name = "dc_NewDetailEntity")
open class NewDetailEntity : StandardEntity() {
    companion object {
        private const val serialVersionUID = 1742223840901860243L
    }
}