package za.co.mmagon.jwebswing.plugins.angulartrackwidth;

import za.co.mmagon.FileTemplates;
import za.co.mmagon.jwebswing.base.angular.directives.AngularDirectiveBase;

/**
 * The Angular Track Width Directive that is applied
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
class AngularTrackWidthDirective extends AngularDirectiveBase
{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Constructs a new AngularTrackWidthDirective
	 */
	public AngularTrackWidthDirective()
	{
		super("AngularTrackWidth");
	}
	
	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(AngularTrackWidthDirective.class, "trackWidth.min").toString();
	}
}
