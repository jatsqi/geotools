/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.filter.v1_1.capabilities;

import javax.xml.namespace.QName;
import org.geotools.api.filter.FilterFactory;
import org.geotools.api.filter.capability.FilterCapabilities;
import org.geotools.api.filter.capability.IdCapabilities;
import org.geotools.api.filter.capability.ScalarCapabilities;
import org.geotools.api.filter.capability.SpatialCapabilities;
import org.geotools.filter.v1_0.capabilities.OGC;
import org.geotools.xsd.AbstractComplexBinding;
import org.geotools.xsd.ElementInstance;
import org.geotools.xsd.Node;

/**
 * Binding object for the type http://www.opengis.net/ogc:_Filter_Capabilities.
 *
 * <p>
 *
 * <pre>
 *   <code>
 *  &lt;xsd:complexType name="_Filter_Capabilities"&gt;
 *      &lt;xsd:sequence&gt;
 *          &lt;xsd:element name="Spatial_Capabilities" type="ogc:Spatial_CapabilitiesType"/&gt;
 *          &lt;xsd:element name="Scalar_Capabilities" type="ogc:Scalar_CapabilitiesType"/&gt;
 *          &lt;xsd:element name="Id_Capabilities" type="ogc:Id_CapabilitiesType"/&gt;
 *      &lt;/xsd:sequence&gt;
 *  &lt;/xsd:complexType&gt;
 *
 *    </code>
 *   </pre>
 *
 * @generated
 */
public class _Filter_CapabilitiesBinding extends AbstractComplexBinding {
    FilterFactory factory;

    public _Filter_CapabilitiesBinding(FilterFactory factory) {
        this.factory = factory;
    }

    /** @generated */
    @Override
    public QName getTarget() {
        return OGC._Filter_Capabilities;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Class getType() {
        return FilterCapabilities.class;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Object parse(ElementInstance instance, Node node, Object value) throws Exception {
        return factory.capabilities(
                FilterCapabilities.VERSION_110,
                node.getChildValue(ScalarCapabilities.class),
                node.getChildValue(SpatialCapabilities.class),
                node.getChildValue(IdCapabilities.class));
    }

    @Override
    public Object getProperty(Object object, QName name) throws Exception {
        FilterCapabilities capabilities = (FilterCapabilities) object;

        if ("version".equals(name.getLocalPart())) {
            return capabilities.getVersion();
        }

        if ("Scalar_Capabilities".equals(name.getLocalPart())) {
            return capabilities.getScalarCapabilities();
        }

        if ("Spatial_Capabilities".equals(name.getLocalPart())) {
            return capabilities.getSpatialCapabilities();
        }

        if ("Id_Capabilities".equals(name.getLocalPart())) {
            return capabilities.getIdCapabilities();
        }

        return null;
    }
}
