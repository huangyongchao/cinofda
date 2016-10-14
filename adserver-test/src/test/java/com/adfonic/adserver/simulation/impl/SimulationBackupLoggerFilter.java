package com.adfonic.adserver.simulation.impl;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Filter that takes care of flushing the backup logger at the end of
 * each request, along with timing each request.
 */
public class SimulationBackupLoggerFilter extends OncePerRequestFilter {
    private final SimulationBackupLogger backupLogger;
    
    @Autowired
    public SimulationBackupLoggerFilter(SimulationBackupLogger backupLogger) {
        this.backupLogger = backupLogger;
    }
        
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        backupLogger.startFilterRequest();
        try {
            filterChain.doFilter(request, response);
        } finally {
            backupLogger.endFilterRequest();
        }
    }
}