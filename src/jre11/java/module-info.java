module com.jwebmp.plugins.angulartrackwidth {
	exports com.jwebmp.plugins.angulartrackwidth;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthDirective;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angulartrackwidth.implementations.AngularTrackWidthExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angulartrackwidth.implementations.AngularTrackWidthExclusionsModule;
}
