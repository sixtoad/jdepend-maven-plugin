package org.codehaus.mojo.jdepend.objects;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * @author Who ever this implemented first.
 */
public class Packages
{
    private java.util.List jdpackage;

    private String[] attributes;

    /**
     * Creates a new instance of Packages.
     */
    public Packages()
    {
    }

    /**
     * @return packages.
     */
    public java.util.List getPackages()
    {
        if ( this.jdpackage == null )
        {
            this.jdpackage = new java.util.ArrayList();
        }

        return this.jdpackage;
    }

    /**
     * @param jdpackage
     */
    public void setPackages( java.util.List jdpackage )
    {
        this.jdpackage = jdpackage;
    }

    /**
     * @param jdpackage
     */
    public void addPackage( JDPackage jdpackage )
    {
        getPackages().add( jdpackage );
    }

    /**
     * @param attrs
     */
    public void setAttribute( String[] attrs )
    {
        this.attributes = attrs;
    }
}
