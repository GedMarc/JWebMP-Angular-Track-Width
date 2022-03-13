import com.jwebmp.plugins.angulartrackwidth.implementations.AngularTrackWidthInclusionModule;

module com.jwebmp.plugins.angulartrackwidth {
	exports com.jwebmp.plugins.angulartrackwidth;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angular;
	
	opens com.jwebmp.plugins.angulartrackwidth to com.jwebmp.core;
	
	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthDirective;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with AngularTrackWidthInclusionModule;
	
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angulartrackwidth.implementations.AngularTrackWidthExclusionsModule;
}
