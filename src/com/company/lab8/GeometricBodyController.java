package com.company.lab8;

public class GeometricBodyController {
    public GeometricBody getBiggestVolumeBody(GeometricBody objects[])
    {
        int n, i, biggestIndex = 0;
        double biggestVolume = 0;
        n = objects.length;
        for(i = 0 ; i < n; i++)
        {
            if(objects[i].getVolume() > biggestVolume)
            {
                biggestVolume = objects[i].getVolume();
                biggestIndex = i;
            }
        }
        return objects[biggestIndex];
    }

    public GeometricBody getBiggestSurfaceBody(GeometricBody objects[])
    {
        int n, i, biggestIndex = 0;
        double biggestSurface = 0;
        n = objects.length;
        for(i = 0 ; i < n; i++)
        {
            if(objects[i].getSurface() > biggestSurface)
            {
                biggestSurface = objects[i].getSurface();
                biggestIndex = i;
            }
        }
        return objects[biggestIndex];
    }

}
