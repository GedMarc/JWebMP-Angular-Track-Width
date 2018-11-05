import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthDirective;
import com.jwebmp.plugins.angulartrackwidth.AngularTrackWidthPageConfigurator;
import com.jwebmp.plugins.angulartrackwidth.implementations.AngularTrackWidthExclusionsModule;

module com.jwebmp.plugins.angulartrackwidth {
	exports com.jwebmp.plugins.angulartrackwidth;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularTrackWidthPageConfigurator;
	provides IAngularDirective with AngularTrackWidthDirective;

	provides IGuiceScanJarExclusions with AngularTrackWidthExclusionsModule;
	provides IGuiceScanModuleExclusions with AngularTrackWidthExclusionsModule;
}
