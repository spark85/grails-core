package org.codehaus.groovy.grails.plugins.support

import grails.util.GrailsUtil

/**
 * @deprecated Use {@link grails.util.GrailsUtil} instead.
 */
class GrailsPluginUtils {

    static grailsVersion

    static getGrailsVersion() {
        return GrailsUtil.getGrailsVersion()
    }
}
