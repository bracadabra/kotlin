/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/resolve/testData/resolve/stdlib/contracts")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirDiagnosticsWithCfgAndStdlibTestGenerated extends AbstractFirDiagnosticsWithCfgAndStdlibTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInContracts() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/resolve/testData/resolve/stdlib/contracts"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @TestMetadata("callsInPlace.kt")
    public void testCallsInPlace() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/contracts/callsInPlace.kt");
    }

    @TestMetadata("conditionalEffects.kt")
    public void testConditionalEffects() throws Exception {
        runTest("compiler/fir/resolve/testData/resolve/stdlib/contracts/conditionalEffects.kt");
    }
}
