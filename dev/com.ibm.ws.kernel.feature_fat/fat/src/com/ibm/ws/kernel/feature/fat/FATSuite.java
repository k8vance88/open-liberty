/*******************************************************************************
 * Copyright (c) 2012, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.kernel.feature.fat;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
               // Disabled FeatureProcessTypeTest.class,
               AutoFeaturesTest.class,
               FeatureTest.class,
               ProductFeatureTest.class,
               UserFeatureTest.class,
               SPIIsolationTest.class,
               FeatureListToolTest.class,
               FeatureManagerToolTest.class,
               SimpleMinifiedServerTest.class,
               MinifyIconsTest.class,
               FeatureManagerIconsTest.class,
               FeatureConflictUpgradeTest.class,
               IgnoreAPITest.class,
               SimpleFeatureUpdateTest.class,
               SystemBundleOverrideTest.class,
               FeatureAPITest.class,
               FeatureAPIServiceTest.class
})
/**
 * Purpose: This suite collects and runs all known good test suites.
 */
public class FATSuite {

}
