module com.jwebmp.plugins.angulartrackwidth {
	exports com.jwebmp.plugins.angulartrackwidth;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthDirective;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angulartrackwidth.implementations.AngularTrackWidthExclusionsModule;
}
