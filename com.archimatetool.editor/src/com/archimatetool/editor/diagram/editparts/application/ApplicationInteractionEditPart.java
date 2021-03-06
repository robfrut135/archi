/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.diagram.editparts.application;

import org.eclipse.draw2d.IFigure;

import com.archimatetool.editor.diagram.editparts.business.BusinessInteractionEditPart;
import com.archimatetool.editor.diagram.figures.application.ApplicationInteractionFigure;


/**
 * Application Interaction Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class ApplicationInteractionEditPart
extends BusinessInteractionEditPart {            
    
    @Override
    protected IFigure createFigure() {
        return new ApplicationInteractionFigure(getModel());
    }
     
}