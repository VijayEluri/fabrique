package org.jodah.fabrique;

import org.jodah.fabrique.Examples;
import org.jodah.fabrique.matcher.MatcherTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



/**
 * Fabrique test suite.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BindingTest.class, 
	BindingsTest.class,
	BindingParamsTest.class, 
	ObjectFactoryTest.class, 
	InjectionTest.class,
	JitBindingTest.class,
	KeyTest.class, 
	MatcherTest.class,
	ModuleTest.class, 
	NamedBindingTest.class,
	PrimitivesTest.class,
	ProviderTest.class, 
	ScopesTest.class, 
	Examples.class,
	})
public class TestSuite {
}