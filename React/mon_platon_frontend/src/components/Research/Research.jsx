import React from 'react';
import ResearchBar from './ResearchBar';
import ResearchRegion from './ResearchRegion';
import ResearchDistance from './ResearchDistance';

class Research extends React.component{
    render(){
        return <div><ResearchBar/> <ResearchRegion/> <ResearchDistance/></div>
    }
}