/*

   Copyright 2006  The Apache Software Foundation 

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.apache.xmlgraphics.image.writer;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Interface which allows image library independent image writing. 
 *
 * @version $Id$
 */
public interface ImageWriter {
    
    public void writeImage(RenderedImage image, OutputStream out) 
            throws IOException;

    public void writeImage(RenderedImage image, OutputStream out, 
            ImageWriterParams params) 
            throws IOException;

    public String getMIMEType();
    
}
