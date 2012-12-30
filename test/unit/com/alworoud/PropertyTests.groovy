package com.alworoud



import grails.test.mixin.*
import org.junit.*

import grails.buildtestdata.mixin.Build

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Property)
@Build([Property,Owner])
class PropertyTests {
    void testProperty() {
        Property property=Property.build(owners:Owner.build())
        assertNotNull property
        assertNotNull property.owners
        assertNotNull property.owners.name
    }
}
