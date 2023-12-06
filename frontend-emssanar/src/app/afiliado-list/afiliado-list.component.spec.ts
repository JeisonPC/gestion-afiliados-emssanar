import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfiliadoListComponent } from './afiliado-list.component';

describe('AfiliadoListComponent', () => {
  let component: AfiliadoListComponent;
  let fixture: ComponentFixture<AfiliadoListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfiliadoListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AfiliadoListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
