package com.jumpcoin.winner.framework;

import com.jumpcoin.winner.framework.Graphics.PixmapFormat;

public interface Pixmap {
    public int getWidth();
 
    public int getHeight();
    
    public PixmapFormat getFormat();
    
    public void dispose();
}
